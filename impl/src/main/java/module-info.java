module my.company.impl {
  // exports my.company.impl;

  requires my.company.api;
  provides my.company.api.Backend with my.company.impl.Middleware;
  // ...
}