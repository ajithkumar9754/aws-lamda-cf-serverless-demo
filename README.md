# aws-lamda-cf-demo

Setup AWS cloud account

seup S3 bucket through AWS console

Setup AWS SDK in local

Checkout the repository

execute mvn clean install to generate jar artifact

Navigate to \aws-lambda\cf-templates

Run below commands in command line

aws cloudformation package --template-file template-cf-dev.yaml --s3-bucket <aws-s3-bucket-name> --output-template-file lamdapoc-packaged-template-dev.yml

aws cloudformation deploy --template-file <File path of lamdapoc-packaged-template-dev.yml> --stack-name lamda-cf-poc-stack-dev --capabilities CAPABILITY_IAM

Once Above commands executed correctly.

Login to AWS console, Navigate to Cloud formation and check the stack created with name 'lamda-cf-poc-stack-dev '

Then Navigate to API Gateway

Verify the API's created or not. We have option to execute our API's from there itself.
