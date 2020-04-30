import React, { Component } from 'react';
import { InputGroup, FormControl, Button, Table, Form } from 'react-bootstrap';
import axios from 'axios';

import './Search.css';
import SearchRow from './SearchRow';

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
                            <td>Видео</td>
                        </tr>
                    </thead>
                    <tbody>
                        {result.map((r, i) => (
                            <SearchRow key={i} res={r} />
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

        axios.get('/api/search', { params })
            .then(response => this.setState({ result: response.data || [] }))
    }
}
