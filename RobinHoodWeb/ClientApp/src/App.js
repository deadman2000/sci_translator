import React, { Component } from 'react';

import './custom.css'

import { TranslateBuilder } from './components/TranslateBuilder';
import { Search } from './components/Search';
import { Container } from 'react-bootstrap';

export default class App extends Component {
    static displayName = App.name;

    render() {
        return (
            <Container>
                <h1>Conquests of the Longbow: The Legend of Robin Hood</h1>
                <TranslateBuilder />
                <hr />
                <Search />
            </Container>
        );
    }
}
