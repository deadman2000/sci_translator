import React, { Component } from 'react';
import { InputGroup, FormControl, Button, Table, Form } from 'react-bootstrap';
import axios from 'axios';

import './Search.css';

class TranslateRow extends Component {
    state = {
        edit: undefined
    }

    constructor(props) {
        super(props)

        this.handleTranslateChange = this.handleTranslateChange.bind(this);
        this.addTranslate = this.addTranslate.bind(this);
    }

    componentWillReceiveProps(nextProps) {
        if (this.state.edit && nextProps.res !== this.props.res) {
            this.setState({ edit: false });
        }
    }

    addTranslate() {
        const { res } = this.props
        let { tr } = this.state

        if (!tr) {
            tr = res.yTrans
        }

        axios.post('/translate', { volume: res.res, en: res.en, tr })
            .then(() => this.setState({ edit: false }))
    }

    handleTranslateChange(event) {
        this.setState({ tr: event.target.value });
    }

    render() {
        const { res } = this.props
        const { edit } = this.state

        return (
            <tr>
                <td>{res.link ? (<a href={"http://notabenoid.org" + res.link}>{res.res}</a>) : res.res}</td>
                <td dangerouslySetInnerHTML={{ __html: res.en_html }} />
                <td dangerouslySetInnerHTML={{ __html: res.ru_html }} />
                {edit ?
                    <td><textarea defaultValue={res.yTrans} onChange={this.handleTranslateChange} />
                        <div className="btn-group btn-group-sm" role="group">
                            <button className="btn btn-secondary" type="button" onClick={() => this.setState({ edit: false })}>
                                Отмена
                            </button>
                            <button className="btn btn-primary" type="button" onClick={this.addTranslate}>
                                Перевести
                            </button>
                        </div>
                    </td>
                :
                    <td onClick={() => this.setState({ edit: true })}>{res.yTrans}</td>
                }
            </tr>
        )
    }
}

export class Search extends Component {
    static displayName = Search.name;

    state = {
        result: []
    }

    constructor(props) {
        super(props)
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    render() {
        const { result } = this.state

        return (
            <div>
                <h2>Поиск</h2>
                <Form noValidate onSubmit={this.handleSubmit}>
                    <Form.Row>
                        <InputGroup className="mb-3">
                            <FormControl placeholder="Поиск" name="q" />
                            <InputGroup.Append>
                                <Button variant="outline-primary" type="submit" value="Submit">GO</Button>
                            </InputGroup.Append>
                        </InputGroup>
                    </Form.Row>
                    <Form.Row>
                        <Form.Check
                            custom inline
                            type="radio"
                            id="lang-all"
                            name="lang"
                            value=""
                            label="ВСЕ"
                        />
                        <Form.Check
                            custom inline
                            type="radio"
                            id="lang-en"
                            name="lang"
                            value="en"
                            label="EN"
                        />
                        <Form.Check
                            custom inline
                            type="radio"
                            id="lang-ru"
                            name="lang"
                            value="ru"
                            label="RU"
                        />
                    </Form.Row>
                </Form>
                <Table className="searchResult">
                    <thead>
                        <tr>
                            <td>Ресурс</td>
                            <td>Оригинал</td>
                            <td>Перевод</td>
                            <td>Yandex Translate</td>
                        </tr>
                    </thead>
                    <tbody>
                        {result.map((r, i) => (
                            <TranslateRow key={i} res={r}/>
                        ))}
                    </tbody>
                </Table>
            </div>
        )
    }


    handleSubmit(e) {
        e.preventDefault();

        const { q, lang } = e.target.elements;
        const params = {
            q: q.value,
            lang: lang.value
        };

        axios.get('/search', { params })
            .then(response => this.setState({ result: response.data || [] }))
    }
}
