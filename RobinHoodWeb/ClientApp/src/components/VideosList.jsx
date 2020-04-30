import React from 'react';

export default function VideosList(props) {
    return <>{props.videos.map((v, i) => <a href={v.url} target="_blank" className="video_preview"><img src={v.image} key={i} /></a>)}</>
}
