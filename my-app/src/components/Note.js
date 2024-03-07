import { MdDeleteForever } from 'react-icons/md';
import React, { useState } from 'react';
const Latex = require('react-latex');

// raw latex is given to us in this function, passed and returned by the note component

// Credit to Chris Blakely for the Notes application
// Credit to ChatGPT for assistance with the POST request, states, etc.
// Example input "$$\\frac{1}{2}$$"

const Note = ({ id, text, date, handleDeleteNote }) => {
    const [latexOutputs, setLatexOutputs] = useState([]);

    const handleRenderClick = () => {
        // Send a POST request to the API endpoint
        fetch('http://localhost:4567/render', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ text: text })
        })
            .then(response => {
                console.log('Response status:', response.status);
                console.log('Response headers:', response.headers);
                return response.text(); // Assuming the response is a plain text LaTeX string
            })
            .then(data => {
                // Split the response string into individual LaTeX expressions
                const latexArray = data.split(',');
                // Format each LaTeX expression and encase it with "$$"
                const formattedLatexArray = latexArray.map(latex => `$$${latex.trim()}$$`);

                console.log(formattedLatexArray)

                setLatexOutputs(formattedLatexArray || []); // Set the LaTeX outputs array
            })
            .catch(error => console.error('Error:', error));
    };

    return (
        <div className='note'>
            <span>{text}</span>
            <div className='note-footer'>
                <small>{date}</small>
                <button onClick={handleRenderClick}>Render</button>
                <MdDeleteForever
                    onClick={() => handleDeleteNote(id)}
                    className='delete-icon'
                    size='1.3em'
                />
            </div>
            {/* Conditional rendering of "LaTeX Output Below" text */}
            {latexOutputs.length > 0 && <p>LaTeX output below</p>}
            {/* Render each LaTeX output separately */}


            {latexOutputs.map((output, index) => (
                <Latex key={index}>{output}</Latex>
            ))}


        </div>
    );
};

export default Note;
