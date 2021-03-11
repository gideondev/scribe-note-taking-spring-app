package com.gideon.scribe.notes.controller;

import com.gideon.scribe.notes.model.Note;
import com.gideon.scribe.notes.model.dto.NoteDto;
import com.gideon.scribe.notes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public ResponseEntity<NoteDto> createNote(NoteDto noteDto) {
        Note savedNote = notesService.save(noteDto.toEntity());
        return new ResponseEntity<NoteDto>(NoteDto.fromEntity(savedNote), null, HttpStatus.OK);
    }

    // Retrieve
    @RequestMapping("/{noteId}")
    public ResponseEntity<NoteDto> getNote(@PathVariable("noteId") Integer noteId) {
        Note note = notesService.findById(noteId);
        return new ResponseEntity<NoteDto>(NoteDto.fromEntity(note), null, HttpStatus.OK);
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
    public ResponseEntity<List<NoteDto>> getAllNotes() {
        List<Note> notes = notesService.findAll();
        List<NoteDto> noteDtos = new ArrayList<>();

        for (Note note : notes) {
            noteDtos.add(NoteDto.fromEntity(note));
        }

        return new ResponseEntity<List<NoteDto>>(noteDtos, null, HttpStatus.OK);
    }
}
