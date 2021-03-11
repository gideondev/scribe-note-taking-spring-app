package com.gideon.scribe.notes.repository;

import com.gideon.scribe.notes.model.Note;
import org.springframework.data.repository.CrudRepository;

public interface NotesRepository extends CrudRepository<Note, Integer> {
}
