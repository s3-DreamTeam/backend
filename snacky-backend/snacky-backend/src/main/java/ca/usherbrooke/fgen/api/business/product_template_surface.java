package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class product_template_surface {

    @JsonProperty("Manufacturer")
    @JsonAlias({"manufacturer_type_p"})
    public String manufacturer_type_p;

    @JsonProperty("Model")
    @JsonAlias({"model_type_p"})
    public String model_type_p;

    @JsonProperty("id")
    @JsonAlias({"id_type_p"})
    public Integer id_type_p;
}
