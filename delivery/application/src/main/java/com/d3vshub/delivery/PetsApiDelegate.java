//package org.example.delivery;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//
//import static org.springframework.http.server.reactive.JettyHttpHandlerAdapter.Jetty11ServerHttpRequest.getRequest;
//
//@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
//        date = "2021-03-22T23:26:32.308871+05:30[Asia/Kolkata]")
//public interface PetsApiDelegate {
//    /**
//     * GET /pets : List all pets
//     *
//     * @param limit How many items to return at one time (max 100) (optional)
//     * @return A paged array of pets (status code 200)
//     *         or unexpected error (status code 200)
//     * @see PetsApi#listPets
//     */
//    default ResponseEntity<List<Pet>> listPets(Integer limit) {
//        getRequest().ifPresent(request -> {
//            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
//                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
//                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" }";
//                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
//                    break;
//                }
//            }
//        });
//        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
//    }
//
//    // other generated method declarations
//}
