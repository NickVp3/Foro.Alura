import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Reaccion from './Reaccion';
import RespuestaOpinion from './RespuestaOpinion';

const TopicDetail = ({ match }) => {
    const [topic, setTopic] = useState({});
    const [responses, setResponses] = useState([]);
    const { id } = match.params;

    useEffect(() => {
        axios.get(`/api/topicos/${id}`)
            .then(response => {
                setTopic(response.data);
            })
            .catch(error => {
                console.error('Hubo un error al obtener el tópico!', error);
            });

        axios.get(`/api/respuestas/topico/${id}`)
            .then(response => {
                setResponses(response.data);
            })
            .catch(error => {
                console.error('Hubo un error al obtener las respuestas!', error);
            });
    }, [id]);

    return (
        <div>
            <h1>{topic.titulo}</h1>
            <p>{topic.contenido}</p>
            <Reaccion topicoId={id} />
            <h2>Respuestas</h2>
            <ul>
                {responses.map(response => (
                    <li key={response.id}>
                        {response.contenido}
                        <RespuestaOpinion respuestaId={response.id} />
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default TopicDetail;

