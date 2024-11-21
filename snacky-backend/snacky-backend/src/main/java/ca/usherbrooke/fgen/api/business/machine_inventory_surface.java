package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class machine_inventory_surface {

    @JsonProperty("Name")
    @JsonAlias({"nom_machine"})
    public String nom_machine;

    @JsonProperty("Location")
    @JsonAlias({"emplacement_machine"})
    public String emplacement_machine;

    @JsonProperty("Lowest product count")
    @JsonAlias({"lowestProductCount_machine"})
    public Integer lowestProductCount_machine;

    @JsonProperty("TemplateID")
    @JsonAlias({"id_type_m"})
    public Integer id_type_m;

    @JsonProperty("id")
    @JsonAlias({"id_machine"})
    public Integer id_machine;
}

