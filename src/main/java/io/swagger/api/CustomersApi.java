/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.12).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Customer;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T14:57:56.068Z")

@Api(value = "customers", description = "the customers API")
public interface CustomersApi {

    @ApiOperation(value = "adds a new customer", nickname = "addCustomer", notes = "Adds a customer to your environment", response = Customer.class, tags={ "developers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Item created", response = Customer.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing item already exists") })
    @RequestMapping(value = "/customers",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Customer> addCustomer(@ApiParam(value = "Customer to create"  )  @Valid @RequestBody Customer customer);


    @ApiOperation(value = "searches customers", nickname = "searchCustomer", notes = "By passing in the appropriate options, you can search for available customers ", response = Customer.class, responseContainer = "List", tags={ "developers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Customer.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Not Authorized") })
    @RequestMapping(value = "/customers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Customer>> searchCustomer();


    @ApiOperation(value = "searches customer by his id", nickname = "searchCustomerById", notes = "By passing in the appropriate options, you can search for available customers ", response = Customer.class, tags={ "developers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Customer.class),
        @ApiResponse(code = 404, message = "Customer has not been found"),
        @ApiResponse(code = 401, message = "Not Authorized") })
    @RequestMapping(value = "/customers/{customerId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Customer> searchCustomerById(@ApiParam(value = "ID of customer your are looking for",required=true) @PathVariable("customerId") String customerId);

}
