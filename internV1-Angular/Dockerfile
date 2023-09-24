# Use an official Node.js runtime as the base image
FROM node:14

# Set the working directory in the container
WORKDIR /app

# Copy package.json and package-lock.json to the working directory
COPY package*.json ./

# Install Angular CLI globally
RUN npm install -g @angular/cli

# Install project dependencies
RUN npm install

# Copy the rest of the application code to the working directory
COPY . .

# Build the Angular app for production
RUN npm run build --prod

# Expose the port that the Angular app will run on (default is 80)
#EXPOSE 80

# Start the Angular application
#CMD ["ng", "serve", "--host", "0.0.0.0", "--port", "80"]
