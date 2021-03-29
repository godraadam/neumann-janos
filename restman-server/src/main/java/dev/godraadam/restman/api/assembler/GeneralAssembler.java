package dev.godraadam.restman.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import dev.godraadam.restman.model.BaseModel;

public interface GeneralAssembler<D, M extends BaseModel> {
    
    D createDTO(M model);
    M createModel(D dto);

    default List<D> createDTOList(List<M> models) {
        return models.stream().map(m -> createDTO(m)).collect(Collectors.toList());
    }

    default List<M> createModelList(List<D> dtos) {
        return dtos.stream().map(d -> createModel(d)).collect(Collectors.toList());
    }
}
