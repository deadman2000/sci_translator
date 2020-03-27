import React, { Component } from 'react';
import { Button, ButtonGroup } from 'react-bootstrap';
import axios from 'axios';

export default class TranslateRow extends Component {
    constructor(props) {
        super(props)

        this.handleTranslateChange = this.handleTranslateChange.bind(this);
        this.addTranslate = this.addTranslate.bind(this);

        this.state = {
            res: props.res,
            edit: undefined
        }
    }

    componentWillReceiveProps(nextProps) {
        if (nextProps.res !== this.state.res) {
            const s = {}
            s.res = nextProps.res
            if (this.state.edit) {
                s.edit = false
            }
            this.setState(s)
        }
    }

    addTranslate() {
        let { res, tr } = this.state

        if (!tr) {
            tr = res.yTrans
        }

        axios.post('/api/translate', { volume: res.res, en: res.en, tr })
            .then(() => {
                res.ru = tr
                this.setState({
                    edit: false,
                    res
                })
            })
    }

    handleTranslateChange(event) {
        this.setState({ tr: event.target.value });
    }

    render() {
        const { edit, res } = this.state

        return (
            <tr>
                <td>
                    <a href={`/volume/${res.res}`}>{res.res}</a>
                    {!!res.link && (<><br /><a href={"http://notabenoid.org" + res.link}>Notabenoid</a></>)}
                </td>
                {res.en_html ? <td dangerouslySetInnerHTML={{ __html: res.en_html }} />
                             : <td>{res.en}</td>}
                {res.ru_html ? <td dangerouslySetInnerHTML={{ __html: res.ru_html }} />
                             : <td>{res.ru}</td>}
                {edit ?
                    <td><textarea defaultValue={res.yTrans} onChange={this.handleTranslateChange} className="w-100" />
                        <ButtonGroup size="sm">
                            <Button variant="secondary" onClick={() => this.setState({ edit: false })}>
                                Отмена
                            </Button>
                            <Button variant="primary" onClick={this.addTranslate}>
                                Перевести
                            </Button>
                        </ButtonGroup>
                    </td>
                    :
                    <td onClick={() => this.setState({ edit: true })}>{res.yTrans}</td>
                }
            </tr>
        )
    }
}
