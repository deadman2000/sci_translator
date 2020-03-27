import React from 'react';
import { Container } from 'react-bootstrap';

import { TranslateBuilder } from './TranslateBuilder';
import { Search } from './Search';

export default function Home() {
    return (
        <Container>
            <h1>Conquests of the Longbow: The Legend of Robin Hood</h1>
            <TranslateBuilder />
            <hr />
            <Search />
        </Container>
    );
}