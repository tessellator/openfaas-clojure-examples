# OpenFaaS Clojure Examples

This project contains examples of building [OpenFaaS](https://www.openfaas.com) functions using the [OpenFaaS Clojure Template](https://github.com/tessellator/openfaas-clojure-template).

In order to run the examples, clone this repository and then install the template using the following command:

```
faas-cli template pull https://github.com/tessellator/openfaas-clojure-template
```

After the template is installed, you are able to deploy the functions using a command like the following:

```
faas-cli up -f ./astronaut-finder.yml
```

Building a function can take a few minutes because all dependencies are downloaded and an uberjar created as part of the process.


Note: You may have to edit the YAML files to support your deployment scenario. They are currently configured to run with the setup in the excellent [getting started post](https://blog.alexellis.io/first-faas-python-function/) by Alex Ellis (the OpenFaaS founder). Check the [OpenFaaS YAML reference](https://docs.openfaas.com/reference/yaml/) if you need help updating the configurations.

## License

Copyright © 2019 Thomas C. Taylor

Distributed under the MIT License, the same as OpenFaaS.
