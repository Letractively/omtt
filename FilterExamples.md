**filters.omtt**:
```
// let's define a template for use as filter
// trimmer takes a string s and integer n
// returns s back when it's shorter than n letters or 'long' otherwise
% def trimmer s.String n.Int
  {
    if s.length < n: s else: "long"
  }
% end

% def testFilters
  // will show 'long'
  {trimmer "unsophisticated" 6}

  // it's the same!
  {"unsophisticated" | trimmer 6}

  // and this too
  {"unsophisticated" apply trimmer 6}

  // let's check a sequence
  // this will show ("three", "long", "a")
  { ("three", "many many many", "a") | trimmer 6 }

  // this will FAIL
  { trimmer ("three", "many many many", "a") 6 }
% end
```