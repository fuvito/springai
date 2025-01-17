# springai
Spring AI - OpenAI Integration

## To compile the project
export OpenAI key as:

Export an environment variable in PowerShell
* **setx OPENAI_API_KEY "your_api_key_here"'**

then add this exported environment variable to the application properties:
* **spring.ai.openai.api-key=${OPENAI_API_KEY}**

OR goto RUN Configurations in IntelliJ Idea and add OPENAI_API_KEY environment variable. 
