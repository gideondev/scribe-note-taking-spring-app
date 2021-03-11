package com.gideon.scribe.notes.service;

import com.gideon.scribe.notes.models.Note;

import java.util.List;

public interface NotesService {
    public Note save(Note note);

    public Note findById(Integer noteId);

    public List<Note> findAll();

    public void deleteNote(Integer noteId);
}
