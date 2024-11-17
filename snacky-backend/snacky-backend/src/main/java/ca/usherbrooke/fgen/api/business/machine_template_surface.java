package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class machine_template_surface {

    @JsonProperty("Manufacturer")
    @JsonAlias({"manufacturer_machine"})
    public String manufacturer_machine;

    @JsonProperty("Model")
    @JsonAlias({"model_machine"})
    public String model_machinet;

    @JsonProperty("id")
    @JsonAlias({"id_machine"})
    public Integer id_machine;
}
