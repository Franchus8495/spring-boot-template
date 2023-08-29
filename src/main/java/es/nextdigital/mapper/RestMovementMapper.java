package es.nextdigital.mapper;

import es.nextdigital.dto.MovementDTO;
import es.nextdigital.entity.Movement;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RestMovementMapper {

    MovementDTO asDTO(Movement src);

    List<MovementDTO> asDTOList(List<Movement> src);

}
