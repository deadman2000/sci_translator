import React, { Component } from 'react';

export default class SearchRow extends Component {
    render() {
        const { res } = this.props

        return (
            <tr>
                <td>
                    <span>{res.res}</span>
                    {/*<a href={`/volume/${res.res}`}>{res.res}</a>*/}
                    {!!res.link && (<a href={"http://notabenoid.org" + res.link} target="_blank"><img src="/notabenoid.png" /></a>)}
                </td>
                {res.en_html ? <td dangerouslySetInnerHTML={{ __html: res.en_html }} />
                    : <td>{res.en}</td>}
                {res.ru_html ? <td dangerouslySetInnerHTML={{ __html: res.ru_html }} />
                    : <td>{res.ru}</td>}
            </tr>
        )
    }
}
