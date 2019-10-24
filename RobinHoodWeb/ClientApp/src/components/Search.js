import React, { Component } from 'react';
import { InputGroup, FormControl, Button, Table } from 'react-bootstrap';
import axios from 'axios';

import './Search.css';

export class Search extends Component {
    static displayName = Search.name;

    state = { result: [] }

    constructor(props) {
        super(props)
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    render() {
        const { result } = this.state;

        return (
            <form onSubmit={this.handleSubmit}>
                <h2>Поиск</h2>

                <InputGroup className="mb-3">
                    <FormControl placeholder="Поиск" name="q" />
                    <InputGroup.Append>
                        <Button variant="outline-primary" type="submit" value="Submit">GO</Button>
                    </InputGroup.Append>
                </InputGroup>

                <Table className="searchResult">
                    <tbody>
                        {result.map((r, i) => (
                            <tr key={i}>
                                <td>{r.ru ? "RU" : "EN"}</td>
                                <td>{r.res}</td>
                                <td dangerouslySetInnerHTML={{ __html: r.text }} />
                            </tr>
                        ))}
                    </tbody>
                </Table>
            </form>
        );
    }


    handleSubmit(e) {
        e.preventDefault();

        const { q } = e.target.elements;
        const params = { q: q.value };

        axios.get('/search', { params })
            .then(response => this.setState({ result: response.data }))
    }
}
