**declarative.omtt**:
```
/* First we declare polymoprphic template. Object will be matched in order of declaring
 * templates.
 * I.e. if we had object that matches more than one template, the first will be used.
 */
% def polysample [String where length > 10]
  long string
% end

% def polysample [String]
  string {it} with length {length}
% end

% def polysample [Int]
  integer number: {it}
% end

% def polysample [Real]
  real number: {it}
% end

% def polysample [Any]
  some other object: {it}
% end

/* Now, let's test it!
 */
% def test
  // will show integer number
  {12 | polysample}

  // will show real number
  {1.11 | polysample}

  // will show long string
  {"many many many words many" | polysample}

  // will show normal string with its length
  {"short" | polysample}

  // will show 'other object' with object converted to string
  {true | polysample}

  // this will work too!
  // items will be transformed item by item
  {(42, 42.42, "abc") | polysample}

  // polymorphic templates may be used as normal functions
  // polysample is treated like any other funciton with type (_ -> Data)
  polysample 11
% end
```