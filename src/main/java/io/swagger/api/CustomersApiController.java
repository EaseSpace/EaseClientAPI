package io.swagger.api;

import io.swagger.model.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T14:08:10.261Z")

@Controller
public class CustomersApiController implements CustomersApi {

    private static final Logger log = LoggerFactory.getLogger(CustomersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Customer> addCustomer(@ApiParam(value = "Customer to create"  )  @Valid @RequestBody Customer customer) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{  \"lastUpdateDate\" : 12345678,  \"name\" : \"My customer\",  \"id\" : 123,  \"accounts\" : [ {    \"credentials\" : {      \"password\" : \"eoDnhoJ\",      \"login\" : \"JohnDoe\"    },    \"lastUpdateDate\" : 12345678,    \"id\" : 123,    \"creationDate\" : 12345678  }, {    \"credentials\" : {      \"password\" : \"eoDnhoJ\",      \"login\" : \"JohnDoe\"    },    \"lastUpdateDate\" : 12345678,    \"id\" : 123,    \"creationDate\" : 12345678  } ],  \"creationDate\" : 12345678}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Customer>> searchCustomer() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Customer>>(objectMapper.readValue("[ {  \"lastUpdateDate\" : 12345678,  \"name\" : \"My customer\",  \"id\" : 123,  \"accounts\" : [ {    \"credentials\" : {      \"password\" : \"eoDnhoJ\",      \"login\" : \"JohnDoe\"    },    \"lastUpdateDate\" : 12345678,    \"id\" : 123,    \"creationDate\" : 12345678  }, {    \"credentials\" : {      \"password\" : \"eoDnhoJ\",      \"login\" : \"JohnDoe\"    },    \"lastUpdateDate\" : 12345678,    \"id\" : 123,    \"creationDate\" : 12345678  } ],  \"creationDate\" : 12345678}, {  \"lastUpdateDate\" : 12345678,  \"name\" : \"My customer\",  \"id\" : 123,  \"accounts\" : [ {    \"credentials\" : {      \"password\" : \"eoDnhoJ\",      \"login\" : \"JohnDoe\"    },    \"lastUpdateDate\" : 12345678,    \"id\" : 123,    \"creationDate\" : 12345678  }, {    \"credentials\" : {      \"password\" : \"eoDnhoJ\",      \"login\" : \"JohnDoe\"    },    \"lastUpdateDate\" : 12345678,    \"id\" : 123,    \"creationDate\" : 12345678  } ],  \"creationDate\" : 12345678} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Customer>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Customer>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
