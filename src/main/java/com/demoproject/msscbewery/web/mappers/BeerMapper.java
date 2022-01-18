package com.demoproject.msscbewery.web.mappers;

import com.demoproject.msscbewery.domain.Beer;
import com.demoproject.msscbewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beer);

}
