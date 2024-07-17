import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const TopicList = () => {
    const [topics, setTopics] = useState([]);

    useEffect(() => {
        axios.get('/api/topicos')
            .then(response => {
                setTopics(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching the topics!', error);
            });
    }, []);

    return (
        <div>
            <h1>Topics</h1>
            <ul>
                {topics.map(topic => (
                    <li key={topic.id}>
                        <Link to={`/topic/${topic.id}`}>{topic.titulo}</Link>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default TopicList;
