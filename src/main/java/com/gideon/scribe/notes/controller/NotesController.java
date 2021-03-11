package com.gideon.scribe.notes.controller;

import com.gideon.scribe.notes.model.Note;
import com.gideon.scribe.notes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NotesController {

    private final NotesService notesService;

    @Autowired
    NotesController(NotesService notesService) {
        this.notesService = notesService;
    }

    // Create
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public ResponseEntity<Note> createNote(Note note) {
        Note savedNote = notesService.save(note);
        return new ResponseEntity<Note>(savedNote, null, HttpStatus.OK);
    }

    // Retrieve
    @RequestMapping("/{noteId}")
    public ResponseEntity<Note> getNote(@PathVariable("noteId") Integer noteId) {
        Note note = notesService.findById(noteId);
        return new ResponseEntity<Note>(note, null, HttpStatus.OK);
    }

    // Update
    // TODO: Implement UPDATE.

    //Delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/{noteId}")
    public void deleteNote(@PathVariable("noteId") Integer noteId) {
        notesService.deleteNote(noteId);
    }

    // Others
    @RequestMapping("/")
    public ResponseEntity<List<Note>> getAllNotes() {
        List<Note> notes = notesService.findAll();
        return new ResponseEntity<List<Note>>(notes, null, HttpStatus.OK);
    }
}
