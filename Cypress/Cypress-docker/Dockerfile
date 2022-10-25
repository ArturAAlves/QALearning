FROM cypress/base:16.17.1
RUN mkdir /APP
WORKDIR /APP
COPY . /APP
RUN npm install
RUN $(npm bin)/cypress verify
RUN ["npm", "run", "cy:run", "npx", "cypress"]
CMD [""]

