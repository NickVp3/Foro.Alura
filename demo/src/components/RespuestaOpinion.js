import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './RespuestaOpinion.css';

const RespuestaOpinion = ({ respuestaId }) => {
    const [opinion, setOpinion] = useState('');
    const [opiniones, setOpiniones] = useState([]);

    useEffect(() => {
        axios.get(`/api/respuesta-opiniones/respuesta/${respuestaId}`)
            .then(response => {
                setOpiniones(response.data);
            })
            .catch(error => {
                console.error('Hubo un error al obtener las opiniones!', error);
            });
    }, [respuestaId]);

    const handleSubmit = (event) => {
        event.preventDefault();
        axios.post('/api/respuesta-opiniones', {
            contenido: opinion,
            respuesta: { id: respuestaId }
        })
        .then(response => {
            setOpiniones([...opiniones, response.data]);
            setOpinion('');
        })
        .catch(error => {
            console.error('Hubo un error al crear la opinión!', error);
        });
    };

    return (
        <div>
            <ul>
                {opiniones.map(op => (
                    <li key={op.id}>{op.contenido}</li>
                ))}
            </ul>
            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    value={opinion}
                    onChange={(e) => setOpinion(e.target.value)}
                    placeholder="Escribe tu opinión"
                />
                <button type="submit">Enviar</button>
            </form>
        </div>
    );
};

export default RespuestaOpinion;
