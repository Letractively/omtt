**tags.omtt**:
```
// let's define very simple template
% def chapter content title
  <h1>Chpather: {title}</h1>
  {content}
% end

// now it can be used in different ways
% def testTag
  % chapter title="Test chapter"
    Test Content
  % end
% end

// it is correct too and results the same
// hovewer the above use is much more readable and intuitive!
//
// take attention to colon at the and of the def line! (means that content is an expression)
% def testAsFunction:
  chapter
    {Test Content}
    title="Test chapter"
% end
```