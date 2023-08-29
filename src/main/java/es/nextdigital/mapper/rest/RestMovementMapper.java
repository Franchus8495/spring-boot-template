package es.nextdigital.mapper.rest;

import es.nextdigital.dto.MovementDTO;
import es.nextdigital.entity.Movement;
import es.nextdigital.entity.MovementType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface RestMovementMapper {

    @Mapping(target = "movementType", source = "movementType", qualifiedByName = "mapMovementType")
    MovementDTO asDTO(Movement src);

    @Named("mapMovementType")
    default String mapMovementType(MovementType src) {
        return src.getDescription();
    }

    List<MovementDTO> asDTOList(List<Movement> src);

}
