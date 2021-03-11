package com.gideon.scribe.notes.service;

import com.gideon.scribe.notes.models.Note;
import com.gideon.scribe.notes.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NotesServiceImpl implements NotesService {

    private final NotesRepository notesRepository;

    @Autowired
    public NotesServiceImpl(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    @Override
    public Note save(Note note) {
        return notesRepository.save(note);
    }

    @Override
    public Note findById(Integer noteId) {
        Optional<Note> data = notesRepository.findById(noteId);
        return data.orElse(null);
    }

    @Override
    public List<Note> findAll() {
        List<Note> list = new ArrayList<>();
        notesRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public void deleteNote(Integer noteId) {
        notesRepository.deleteById(noteId);
    }
}
