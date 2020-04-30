import React from 'react';

import { TranslateBuilder } from './TranslateBuilder';
import { Search } from './Search';

export default function Home() {
    return (
        <div className="px-4">
            <h1>Conquests of the Longbow: The Legend of Robin Hood</h1>
            <TranslateBuilder />
            <hr />
            <Search />
        </div>
    );
}