import React, { Component } from 'react';
import VideosList from './VideosList';

export default class SearchRow extends Component {
    render() {
        const { res } = this.props

        return (
            <tr>
                <td>
                    <a href={`/volume/${res.res}`}>{res.res}:{res.index}</a>&nbsp;
                    {!!res.notaLink && (<a href={"http://notabenoid.org" + res.notaLink} target="_blank"><img src="/notabenoid.png" /></a>)}
                </td>
                {res.en_html ? <td dangerouslySetInnerHTML={{ __html: res.en_html }} className="searchText" /> : <td>{res.en}</td>}
                {res.tr_html ? <td dangerouslySetInnerHTML={{ __html: res.tr_html }} className="searchText" /> : <td>{res.tr}</td>}
                <td>
                    {res.videos && <VideosList videos={res.videos} /> }
                </td>
            </tr>
        )
    }
}
