/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.PlanningCheck;
import io.swagger.model.PlanningOptions;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-24T15:10:42.894Z[GMT]")
@Api(value = "planning-options", description = "the planning-options API")
public interface PlanningOptionsApi {

    @ApiOperation(value = "", nickname = "planningOptionsPost", notes = "Returns available transport options for given coordinate and radius. <p>Start time can be defined, but is optional. If startTime is not provided, but required by the third party API, a default value of \"Date.now()\" is used. [from MaaS-API /listing]. During the routing phase this service can be used to check availability without any state changes. <p>In the final check, just before presenting the alternatives to the user, a call should be made using `provide-ids`, requesting the TO to provide unique IDs to reference to during communication with the MP. <p>see (2.1) in the process flow - planning", response = PlanningOptions.class, authorizations = {
        @Authorization(value = "ApiKeyAuth"),
@Authorization(value = "BasicAuth"),
@Authorization(value = "BearerAuth"),
@Authorization(value = "OAuth", scopes = { 
            }),
@Authorization(value = "OpenId")    }, tags={ "planning","TO", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Available transport methods matching the given query parameters. If no transport methods are available, an empty array is returned.", response = PlanningOptions.class),
        @ApiResponse(code = 202, message = "Request was successfully accepted for processing but has not yet completed."),
        @ApiResponse(code = 400, message = "Bad request (invalid query or body parameters).", response = Error.class),
        @ApiResponse(code = 401, message = "Authorization error (invalid API key) or insufficient access rights given current authorization.", response = Error.class) })
    @RequestMapping(value = "/planning-options/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PlanningOptions> planningOptionsPost(@ApiParam(value = "ISO 639-1 two letter language code" ,required=true) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage
,@ApiParam(value = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true) @RequestHeader(value="Api", required=true) String api
,@ApiParam(value = "Version of the API." ,required=true) @RequestHeader(value="Api-Version", required=true) String apiVersion
,@ApiParam(value = ""  )  @Valid @RequestBody PlanningCheck body
);

}