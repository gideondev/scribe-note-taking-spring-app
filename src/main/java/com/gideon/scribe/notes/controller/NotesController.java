package com.gideon.scribe.notes.controller;

import com.gideon.scribe.notes.models.Note;
import com.gideon.scribe.notes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notes")
public class NotesController {

    @Autowired
    private NotesService notesService;

    // Create
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public Note createNote(Note note) {
        return notesService.save(note);
    }

    // Retrieve
    @RequestMapping(method = RequestMethod.POST, value = "/{noteId}")
    public Note getNote(@RequestParam("noteId") Integer noteId) {
        return notesService.findById(noteId);
    }

    // Update
    // TODO: Implement UPDATE.

    //Delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/{noteId}")
    public void deleteNote(@RequestParam("noteId") Integer noteId) {
        notesService.deleteNote(noteId);
    }
}
