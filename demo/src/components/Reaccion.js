import React, { useState } from 'react';
import axios from 'axios';
import './Reaccion.css';

const Reaccion = ({ topicoId }) => {
    const [tipo, setTipo] = useState('');

    const handleReaccion = (tipo) => {
        axios.post('/api/reacciones', {
            tipo,
            topico: { id: topicoId }
        })
        .then(response => {
            console.log('Reacción creada:', response.data);
        })
        .catch(error => {
            console.error('Hubo un error al crear la reacción!', error);
        });
    };

    return (
        <div>
            <button onClick={() => handleReaccion('like')}>Like</button>
            <button onClick={() => handleReaccion('dislike')}>Dislike</button>
        </div>
    );
};

export default Reaccion;
