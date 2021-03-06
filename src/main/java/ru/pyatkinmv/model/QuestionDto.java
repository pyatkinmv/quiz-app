package ru.pyatkinmv.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestionDto {
    private Integer id;
    private String text;
    private List<AnswerDto> answers;
    private AnswerDto correctAnswer;
}
