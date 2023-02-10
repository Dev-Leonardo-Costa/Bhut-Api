package com.bhut.bhutapi.models.dtos;

import com.bhut.bhutapi.models.Log;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class LogDTOAssembler {

    @Autowired
    private final ModelMapper modelMapper;

    public LogDTO toModelDTO(Log log) {
        return modelMapper.map(log, LogDTO.class);
    }

    public List<LogDTO> toCollectionModel(List<Log> logs){
        return logs.stream()
                .map(this::toModelDTO)
                .collect(Collectors.toList());
    }
}
