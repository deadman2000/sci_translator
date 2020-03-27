import React, { Component } from 'react';
import { Table } from 'react-bootstrap';
import axios from 'axios';
import TranslateRow from './TranslateRow'

export default class Volume extends Component {
    state = {
        rows: []
    }

    componentDidMount() {
        const { volumeName } = this.props.match.params;
        axios.get(`/api/volume/${volumeName}`)
            .then(r => this.setState({ rows: r.data }))
    }

    render() {
        // const { volumeName } = this.props.match.params;
        const { rows } = this.state

        return (
            <Table>
                <thead>
                    <tr>
                        <td>Ссылки</td>
                        <td>Оригинал</td>
                        <td>Перевод</td>
                        <td>Yandex Translate</td>
                    </tr>
                </thead>
                <tbody>
                    {rows.map((r, i) => (
                        <TranslateRow key={i} res={r} />
                    ))}
                </tbody>
            </Table>
        )
    }
}