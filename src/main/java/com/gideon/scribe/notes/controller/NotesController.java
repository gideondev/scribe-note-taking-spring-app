package com.gideon.scribe.notes.controller;

import com.gideon.scribe.notes.models.Note;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notes")
public class NotesController {
    // Create
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public Note createNote(Note note) {
        // TODO: Implement this.
        return null;
    }

    // Retrieve
    @RequestMapping(method = RequestMethod.POST, value = "/{noteId}")
    public Note getNote(@RequestParam("noteId") Integer noteId) {
        // TODO: Implement this.
        return null;
    }

    // Update
    // TODO: Implement UPDATE.

    //Delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/{noteId}")
    public void deleteNote(@RequestParam("noteId") Integer noteId) {
        // TODO: Implement this.
    }
}
