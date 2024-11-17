package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class machine_template_surface {

    @JsonProperty("Manufacturer")
    @JsonAlias({"manufacturier_type_m"})
    public String manufacturer_machine;

    @JsonProperty("Model")
    @JsonAlias({"model_type_m"})
    public String model_machine;

    @JsonProperty("id")
    @JsonAlias({"id_machine"})
    public Integer id_machine;
}
