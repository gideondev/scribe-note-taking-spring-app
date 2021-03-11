package com.gideon.scribe.notes.service;

import com.gideon.scribe.notes.models.Note;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService {
    @Override
    public Note save(Note note) {
        return new Note(1, "Saving note", "This is Dummy data.");
    }

    @Override
    public Note findById(Integer noteId) {
        return null;
    }

    @Override
    public List<Note> findAll() {
        return null;
    }

    @Override
    public void deleteNote(Integer noteId) {

    }
}
