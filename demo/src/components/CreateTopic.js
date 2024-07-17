import React, { useState } from 'react';
import axios from 'axios';

const CreateTopic = () => {
    const [titulo, setTitulo] = useState('');
    const [contenido, setContenido] = useState('');

    const handleSubmit = (event) => {
        event.preventDefault();
        axios.post('/api/topicos', { titulo, contenido })
            .then(response => {
                console.log('Topic created successfully!', response.data);
            })
            .catch(error => {
                console.error('There was an error creating the topic!', error);
            });
    };

    return (
        <form onSubmit={handleSubmit}>
            <div>
                <label>Title</label>
                <input
                    type="text"
                    value={titulo}
                    onChange={(e) => setTitulo(e.target.value)}
                    required
                />
            </div>
            <div>
                <label>Content</label>
                <textarea
                    value={contenido}
                    onChange={(e) => setContenido(e.target.value)}
                    required
                ></textarea>
            </div>
            <button type="submit">Create Topic</button>
        </form>
    );
};

export default CreateTopic;
