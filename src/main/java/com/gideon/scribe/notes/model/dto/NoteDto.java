package com.gideon.scribe.notes.model.dto;

import com.gideon.scribe.notes.model.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteDto {
    Integer id;
    String title;
    String content;

    public Note toEntity() {
        return new Note(id, title, content);
    }

    public static NoteDto fromEntity(Note note) {
        return new NoteDto(note.getId(), note.getTitle(), note.getContent());
    }
}
