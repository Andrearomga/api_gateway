package com.example.ordenesservice.ordenes.infrestructure.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class CreateOrdenResponse {
    private OrdenResponse orden;
    private List<OrdenProductosResponse> productos;
}
