package com.aipalcare.org.lambda.save.api;

import com.aipalcare.org.lambda.save.api.models.LambdaRequest;
import com.aipalcare.org.lambda.save.api.models.LambdaResponse;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SaveOrgAPI implements RequestHandler<LambdaRequest, LambdaResponse> {
    @Override
    public LambdaResponse handleRequest(LambdaRequest input, Context context) {
        context.getLogger().log(input.toString());
        LambdaResponse response = new LambdaResponse();
        response.setStatusMsg("Successfully saved!" + input.toString());
        return response;
    }
}
