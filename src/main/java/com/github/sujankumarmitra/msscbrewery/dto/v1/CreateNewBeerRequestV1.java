package com.github.sujankumarmitra.msscbrewery.dto.v1;

import com.github.sujankumarmitra.msscbrewery.model.v1.BeerV1;

/**
 * Request Body POJO of {@link com.github.sujankumarmitra.msscbrewery.resource.v1.BeerResourceV1#createNewBeer(CreateNewBeerRequestV1)}
 *
 * @author skmitra
 * @version 1.0
 */
public class CreateNewBeerRequestV1 implements BeerV1 {
    private String id;
    private String name;
    private String style;
    private Long upc;

    public CreateNewBeerRequestV1() {
    }

    public CreateNewBeerRequestV1(String id, String name, String style, Long upc) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.upc = upc;
    }

    public CreateNewBeerRequestV1(BeerV1 beer) {
        this(
                beer.getId(),
                beer.getName(),
                beer.getStyle(),
                beer.getUpc()
        );
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public Long getUpc() {
        return upc;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }
}
