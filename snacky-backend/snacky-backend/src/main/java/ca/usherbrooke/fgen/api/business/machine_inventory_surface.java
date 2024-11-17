package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class machine_inventory_surface {

    @JsonProperty("Name")
    @JsonAlias({"name_machine"})
    public String name_machine;

    @JsonProperty("Location")
    @JsonAlias({"location_machine"})
    public String location_machine;

    @JsonProperty("Lowest product count")
    @JsonAlias({"lowestProductCount_machine"})
    public Integer lowestProductCount_machine;

    @JsonProperty("TemplateID")
    @JsonAlias({"templateId_machine"})
    public Integer templateId_machine;

    @JsonProperty("id")
    @JsonAlias({"id_machine"})
    public Integer id_machine;
}

