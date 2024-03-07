import Note from './components/Note';
import React from 'react'
import { useState, useEffect } from 'react';
import { nanoid } from 'nanoid';
import NotesList from './components/NotesList';
import Search from './components/Search';
import Header from './components/Header';
// Credits to Chris Blakely for Notes App Tutorial
// Install nanoid library, in which the ID is used for deleting notes

const App = () => {
    const [notes, setNotes] = useState([
        {
            id: nanoid(),
            text: 'Note 1',
            date: '15/02/2024',
        },
        {
            id: nanoid(),
            text: 'Note 2',
            date: '21/02/2024',
        },
        {
            id: nanoid(),
            text: 'Note 3',
            date: '28/02/2024',
        },
        {
            id: nanoid(),
            text: 'Note 4',
            date: '30/02/2024',
        },
    ]);

    const [searchText, setSearchText] = useState('');

    const [darkMode, setDarkMode] = useState(false);

    useEffect(() => {
        const savedNotes = JSON.parse(
            localStorage.getItem('react-notes-app-data')
        );

        if (savedNotes) {
            setNotes(savedNotes);
        }
    }, []);

    useEffect(() => {
        localStorage.setItem(
            'react-notes-app-data',
            JSON.stringify(notes)
        );
    }, [notes]);

    const addNote = (text) => {
        const date = new Date();
        const newNote = {
            id: nanoid(),
            text: text,
            date: date.toLocaleDateString(),
        };
        const newNotes = [...notes, newNote];
        setNotes(newNotes);
    };

    const deleteNote = (id) => {
        const newNotes = notes.filter((note) => note.id !== id);
        setNotes(newNotes);
    };

    return (
        <div className={`${darkMode && 'dark-mode'}`}>
            <div className='container'>
                <Header handleToggleDarkMode={setDarkMode} />
                <Search handleSearchNote={setSearchText} />
                <NotesList
                    notes={notes.filter((note) =>
                        note.text.toLowerCase().includes(searchText)
                    )}
                    handleAddNote={addNote}
                    handleDeleteNote={deleteNote}
                />
            </div>
        </div>
    );
};

export default App;