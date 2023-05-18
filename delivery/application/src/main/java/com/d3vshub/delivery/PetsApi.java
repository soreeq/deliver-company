//package org.example.delivery;
//
//import io.swagger.annotations.*;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
//        date = "2021-03-22T23:26:32.308871+05:30[Asia/Kolkata]")
//@Validated
//@Api(value = "pets", description = "the pets API")
//public interface PetsApi {
//    /**
//     * GET /pets : List all pets
//     *
//     * @param limit How many items to return at one time (max 100) (optional)
//     * @return A paged array of pets (status code 200)
//     *         or unexpected error (status code 200)
//     */
//    @ApiOperation(value = "List all pets", nickname = "listPets", notes = "",
//            response = Pet.class, responseContainer = "List", tags={ "pets", })
//    @ApiResponses(value = { @ApiResponse(code = 200, message = "A paged array of pets",
//            response = Pet.class, responseContainer = "List"),
//            @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
//    @GetMapping(value = "/pets", produces = { "application/json" })
//    default ResponseEntity<List> listPets(@ApiParam(
//            value = "How many items to return at one time (max 100)")
//                                          @Valid @RequestParam(value = "limit", required = false) Integer limit) {
//        return getDelegate().listPets(limit);
//    }
//
//    // other generated methods
//}
