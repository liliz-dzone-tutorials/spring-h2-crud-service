package es.lili.simple.samples.annotations;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) // Para que se pueda usar en clases
@Retention(RetentionPolicy.RUNTIME) // Disponible en tiempo de ejecución
@ApiResponse(responseCode = "400", description = "Bad Request",
        content = @Content(schema = @Schema(example =
                "{\"httpStatusCode\": 400,\"httpStatusReasonPhrase\": \"Bad Request\","
                        + SwaggerConstants.COMMON_ERROR_BODY)))
@ApiResponse(responseCode = "401", description = "Unauthorized - Falta autenticación",
        content = @Content(schema = @Schema(example =
                "{\"httpStatusCode\": 401,\"httpStatusReasonPhrase\": \"Unauthorized\","
                        + SwaggerConstants.COMMON_ERROR_BODY)))
@ApiResponse(responseCode = "404", description = "Not Found - Recurso no encontrado",
        content = @Content(schema = @Schema(example =
                "{\"httpStatusCode\": 404,\"httpStatusReasonPhrase\": \"Not Found\","
                        + SwaggerConstants.COMMON_ERROR_BODY)))
@ApiResponse(responseCode = "500", description = "Internal Server Error - Error interno del servidor",
        content = @Content(schema = @Schema(example =
                "{\"httpStatusCode\": 500,\"httpStatusReasonPhrase\": \"Internal Server error\","
                        + SwaggerConstants.COMMON_ERROR_BODY)))
public @interface CommonApiResponses {
}
